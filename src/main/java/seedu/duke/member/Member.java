package seedu.duke.member;

public class Member {

    protected String name;
    protected String studentNumber;

    /* Gender of member: M = Male, F = Female */
    protected char gender;

    /* Status of member. True if still in team, False if left the team */
    protected boolean isActive;

    protected int phoneNumber;

    /**
     * Constructor for any type of member.
     *
     * @param name              Name of member
     * @param studentNumber     Student number of member
     * @param gender            Gender of student M/F
     * @param phoneNumber       Phone number of student
     */
    public Member(String name, String studentNumber, char gender, int phoneNumber) {
        setName(name);
        setStudentNumber(studentNumber);
        setAsActiveMember();
        setGender(gender);
        setPhoneNumber(phoneNumber);
    }

    public Member() {
    }

    public Member(Member member) {
        setName(member.name);
        setStudentNumber(member.studentNumber);
        setAsActiveMember();
        setGender(member.gender);
        setPhoneNumber(member.phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGender(char gender) {
        this.gender = gender;
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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }

    public String getStudentNumber() { return studentNumber; }

    /**
     * Formats description of member to be displayed to user.
     *
     * @return Formatted string of a member
     */
    @Override
    public String toString() {
        return String.format("Name: %s | Student Number: %s | Gender: %c | Phone Number: %d", this.name,
                this.studentNumber, this.gender, this.phoneNumber);
    }
  
}
