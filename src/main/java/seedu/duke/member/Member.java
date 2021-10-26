package seedu.duke.member;

public class Member {

    protected String name;
    protected String studentNumber;

    /* Gender of member: M = Male, F = Female */
    protected String gender;

    /* Status of member. True if still in team, False if left the team */
    protected Boolean isActive;

    /* 1 if present, 0 if absent */
    //String presentOrAbsent;

    protected String phoneNumber;

    /**
     * Constructor for any type of member.
     *
     * @param name          Name of member
     * @param studentNumber Student number of member
     * @param gender        Gender of student M/F
     * @param phoneNumber   Phone number of student
     */
    public Member(String name, String studentNumber, String gender, String phoneNumber) {
        setName(name);
        setStudentNumber(studentNumber);
        setAsActiveMember();
        setGender(gender);
        setPhoneNumber(phoneNumber);
        // setPresentOrAbsent(presentOrAbsent);
    }

    public Member() {
    }

    public Member(String name, String studentNumber, String gender, String phoneNumber, String presentOrAbsent) {
        setName(name);
        setStudentNumber(studentNumber);
        setAsActiveMember();
        setGender(gender);
        setPhoneNumber(phoneNumber);
        //setPresentOrAbsent(presentOrAbsent);
    }

    public Member(String name, String studentNumber) {
        setName(name);
        setStudentNumber(studentNumber);
        setAsActiveMember();
        //setPresentOrAbsent(presentOrAbsent);
    }


    public Member(Member member) {
        setName(member.name);
        setStudentNumber(member.studentNumber);
        setAsActiveMember();
        setGender(member.gender);
        setPhoneNumber(member.phoneNumber);
        //setPresentOrAbsent(presentOrAbsent);
    }

    public boolean checkIfActive() {
        return isActive;
    }

    public void setAsActiveMember() {
        this.isActive = true;
    }

    public void setAsInActiveMember() {
        this.isActive = false;
    }

    /* public void setPresentOrAbsent(String presentOrAbsent) {
         this.presentOrAbsent = presentOrAbsent;
     }
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /*
    public String getAttendance() {
        return presentOrAbsent;
    }
    */

    /**
     * Formats description of member to be displayed to user.
     *
     * @return Formatted string of a member
     */
    @Override
    public String toString() {
        return String.format("Name: %s | Student Number: %s | Gender: %s | Phone Number: %s", this.name,
                this.studentNumber, this.gender, this.phoneNumber);
    }

}
