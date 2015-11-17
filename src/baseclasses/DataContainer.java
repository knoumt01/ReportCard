package baseclasses;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import utilities.Logger;

public class DataContainer {
    
    private ArrayList<Classroom> listOfClassrooms = new ArrayList<>();
    private ArrayList<Course> listOfCourses = new ArrayList<>();
    private ArrayList<Faculty> listOfFaculty = new ArrayList<>();
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }
    
    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }
    
    public void setListOfCourses(ArrayList<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
    
    public ArrayList<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }
    
    public void setListOfFaculty(ArrayList<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }
    
    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }
    
    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    public void writeXML() {
        DocumentBuilderFactory docBuildFactory = DocumentBuilderFactory.newInstance();
        try {
            // create an instance of DocumentBulder for creating the xml doc files
            DocumentBuilder docBuilder = docBuildFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootReportCard = doc.createElement("report_card");
            
            // classrooms
            Element root = doc.createElement("list_of_classrooms");

            // iterate over classroom list and create elements
            for (Classroom classroom : listOfClassrooms) {
                Element classroomElement = doc.createElement("classroom");

                Element roomNumberElement = doc.createElement("room_number");
                Text roomNumberText = doc.createTextNode(classroom.getRoomNumber());
                roomNumberElement.appendChild(roomNumberText);
                classroomElement.appendChild(roomNumberElement);
                Element roomTypeElement = doc.createElement("room_type");
                Text roomTypeText = doc.createTextNode(classroom.getRoomType());
                roomTypeElement.appendChild(roomNumberText);
                classroomElement.appendChild(roomTypeElement);
                root.appendChild(classroomElement);
                rootReportCard.appendChild(root);
            }
        
            // deal with course xml
            Element root2 = doc.createElement("list_of_courses");

            // iterate over course list and create elements - id, name, room
            for (Course course : listOfCourses) {
                Element courseElement = doc.createElement("course");
                Element courseIDElement = doc.createElement("course_id");
                Text courseIDText = doc.createTextNode(Float.toString(course.getCourseIdNumber()));
                courseIDElement.appendChild(courseIDText);
                courseElement.appendChild(courseIDElement);
                Element courseNameElement = doc.createElement("course_name");
                Text courseNameText = doc.createTextNode(course.getCourseName());
                courseNameElement.appendChild(courseNameText);
                courseElement.appendChild(courseNameElement);
                Element courseRoomElement = doc.createElement("room");
                Text courseRoomText = doc.createTextNode(course.getRoom());
                courseRoomElement.appendChild(courseRoomText);
                courseElement.appendChild(courseRoomElement);
                root2.appendChild(courseElement);
                rootReportCard.appendChild(root2);
            }
            
            // deal with faculty xml
            Element root3 = doc.createElement("list_of_faculty");
            
            // iterate over faculty list - person: name, add, ssn, dob, dateofhire, salary, arraylist<course>
            for (Faculty faculty : listOfFaculty) {
                Element facultyElement = doc.createElement("faculty");
                Element fNameElement = doc.createElement("name");
                Text fNameText = doc.createTextNode(faculty.getName());
                fNameElement.appendChild(fNameText);
                facultyElement.appendChild(fNameElement);
                Element fAddressElement = doc.createElement("address");
                Text fAddressText = doc.createTextNode(faculty.getAddress());
                fAddressElement.appendChild(fAddressText);
                facultyElement.appendChild(fAddressElement);                
                Element fSSNElement = doc.createElement("social_security_number");
                Text fSSNText = doc.createTextNode(faculty.getSocialSecurityNumber());
                fSSNElement.appendChild(fSSNText);
                facultyElement.appendChild(fSSNElement);  
                Element fDOBElement = doc.createElement("date_of_birth");
                Text fDOBText = doc.createTextNode(faculty.getDateOfBirth());
                fDOBElement.appendChild(fDOBText);
                facultyElement.appendChild(fDOBElement);                 
                Element fDOHElement = doc.createElement("date_of_hire");
                Text fDOHText = doc.createTextNode(faculty.getDateOfHire());
                fDOHElement.appendChild(fDOHElement);
                facultyElement.appendChild(fDOHElement);  
                Element fSalaryElement = doc.createElement("salary");
                Text fSalaryText = doc.createTextNode(Double.toString(faculty.getSalary()));
                fSalaryElement.appendChild(fSalaryText);
                facultyElement.appendChild(fSalaryElement);  
                Element fCourseListElement = doc.createElement("course_list");
                for (Course course : faculty.getCourses()) {
                    Element fCourseElement = doc.createElement("course");
                    Text fCourseText = doc.createTextNode(course.toString());
                    fCourseElement.appendChild(fCourseText);
                    fCourseListElement.appendChild(fCourseElement);
                }
                root3.appendChild(facultyElement);
                rootReportCard.appendChild(root3);
            }
            
            // construct XML hierarchy for students
            Element root4 = doc.createElement("list_of_students");

            // iterate over students list. variables: name, address, ssn, dob, currentGPA, date of graduation, courselist
            for (Student student : listOfStudents) {
                Element studentElement = doc.createElement("student");
                Element sNameElement = doc.createElement("name");
                Text sNameText = doc.createTextNode(student.getName());
                sNameElement.appendChild(sNameText);
                studentElement.appendChild(sNameElement);
                Element sAddressElement = doc.createElement("address");
                Text sAddressText = doc.createTextNode(student.getAddress());
                sAddressElement.appendChild(sAddressText);
                studentElement.appendChild(sAddressElement);
                Element sSSNElement = doc.createElement("social_security_number");
                Text sSSNText = doc.createTextNode(student.getSocialSecurityNumber());
                sSSNElement.appendChild(sSSNText);
                studentElement.appendChild(sSSNElement);
                Element sDOBElement = doc.createElement("date_of_birth");
                Text sDOBText = doc.createTextNode(student.getDateOfBirth());
                sDOBElement.appendChild(sDOBText);
                studentElement.appendChild(sDOBElement);
                Element sGPAElement = doc.createElement("current_GPA");
                Text sGPAText = doc.createTextNode(Float.toString(student.getCurrentGPA()));
                sGPAElement.appendChild(sGPAText);
                studentElement.appendChild(sGPAElement);
                Element sDOGElement = doc.createElement("date_of_graduation");
                Text sDOGText = doc.createTextNode(student.getDateOfGraduation());
                sDOGElement.appendChild(sDOGText);
                studentElement.appendChild(sDOGElement);
                Element sCourseListElement = doc.createElement("course_list");
                for (Course course : student.getCourses()) {
                    Element sCourseElement = doc.createElement("course");
                    Text sCourseText = doc.createTextNode(course.toString());
                    sCourseElement.appendChild(sCourseText);
                    sCourseListElement.appendChild(sCourseElement);
                }
                root4.appendChild(studentElement);
                rootReportCard.appendChild(root4);
            }
            
            doc.appendChild(rootReportCard);
            
            // format and save XML document
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(new File("reprtcrd.xml")), format);
            serializer.serialize(doc);
            
        }
        catch ( Exception e ) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void readXML() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse("reprtcrd.xml");
            Element root = dom.getDocumentElement();

            // classrooms
            NodeList roomList = root.getElementsByTagName("classroom");
            for ( int i = 0; i < roomList.getLength(); i++ ) {
                Element roomElement = (Element) roomList.item(i);
                Classroom classroom = new Classroom();
                setClassroomValues(roomElement, classroom);
            }
            
            // courses
            NodeList courseList = root.getElementsByTagName("course");
            for ( int i = 0; i < courseList.getLength(); i++ ) {
                Element courseElement = (Element) courseList.item(i);
                Course course = new Course();
                setCourseValues(courseElement, course);
            }

            // faculty
            NodeList facultyList = root.getElementsByTagName("faculty");
            for ( int i = 0; i < courseList.getLength(); i++ ) {
                Element facultyElement = (Element) facultyList.item(i);
                Faculty faculty = new Faculty();
                setFacultyValues(facultyElement, faculty);
            }
            
            // student
            NodeList studentList = root.getElementsByTagName("student");
            for ( int i = 0; i < courseList.getLength(); i++ ) {
                Element studentElement = (Element) studentList.item(i);
                Student student = new Student();
                setStudentValues(studentElement, student);
            }
        } 
        catch (FileNotFoundException nfe) {
            Logger.logError(nfe.getMessage());
        } 
        catch (ParserConfigurationException | SAXException | IOException e) {
            Logger.logError(e.getMessage());
        }
    }
    
    private void setFacultyValues(Element element, Faculty faculty) {
        faculty.setName(getTextValue(element,"name"));
        faculty.setAddress(getTextValue(element,"address"));
        faculty.setSocialSecurityNumber(getTextValue(element,"social_security_number"));
        faculty.setDateOfBirth(getTextValue(element,"date_of_birth"));
        faculty.setDateOfHire(getTextValue(element,"date_of_hire"));
        faculty.setSalary(Double.valueOf(getTextValue(element,"salary")));
       // faculty.setCourses(listOfCourses);
        listOfFaculty.add(faculty);
    }
    
    private void setStudentValues(Element element, Student student) {
        student.setName(getTextValue(element,"name"));
        student.setAddress(getTextValue(element,"address"));
        student.setSocialSecurityNumber(getTextValue(element,"social_security_number"));
        student.setDateOfBirth(getTextValue(element,"date_of_birth"));
        student.setCurrentGPA(Float.valueOf(getTextValue(element,"current_GPA")));
        student.setDateOfGraduation(getTextValue(element,"date_of_graduation"));
       // student.setCourses(listOfCourses);
        listOfStudents.add(student);
    }

    private void setCourseValues(Element element, Course course) {
        course.setCourseIdNumber(Float.valueOf(getTextValue(element,"course_id")));
        course.setCourseName(getTextValue(element,"course_name"));
        course.setRoom(getTextValue(element,"room"));
        listOfCourses.add(course);
    }
    
    private void setClassroomValues(Element element, Classroom classroom) {
        classroom.setRoomNumber(getTextValue(element, "room_number"));
        classroom.setRoomType(getTextValue(element, "room_type"));
        listOfClassrooms.add(classroom);
    }

    private String getTextValue(Element ele, String tagName) {
        String textVal = null;
        NodeList nl = ele.getElementsByTagName(tagName);
        if (nl != null && nl.getLength() > 0) {
            Element el = (Element) nl.item(0);
            textVal = el.getFirstChild().getNodeValue();
        }
        return textVal;
    }
}