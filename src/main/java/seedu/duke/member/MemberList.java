package seedu.duke.member;

import java.util.ArrayList;
import seedu.duke.member.exception.InvalidMemberException;

public class MemberList {

    private final ArrayList<Member> memberList;

    public MemberList() {
        memberList = new ArrayList<Member>();
    }

    public MemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }


    public ArrayList<Member> getMemberList() {
        return memberList;
    }


    public int getMemberSize() { //added by xy
        return memberList.size();
    }

    public String getMemberName(int index) { //added by xy
        return memberList.get(index - 1).name;
    }

    public String getMemberStudentNumber(int index) { //added by xy
        return memberList.get(index - 1).studentNumber;
    }

    public char getMemberGender(int index) { //added by xy
        return memberList.get(index - 1).gender;
    }

    public String getMemberPhoneNumber(int index) { //added by xy
        return String.valueOf(memberList.get(index - 1).phoneNumber);
    }

    /**
     * Add member as request by user.
     *
     * @param member member to be added
     */
    public void addMember(Member member) {
        memberList.add(member);
    }

    /**
     * Get member by index.
     *
     * @param memberNumber member number according to member list
     * @return member request by memberNumber
     */
    public Member getMember(int memberNumber) throws InvalidMemberException{
        Member member = new Member();
        try {
            boolean isWithinMemberList = (memberNumber > 0) && (memberNumber <= memberList.size());
            if (isWithinMemberList) {
                int index = memberNumber - 1;
                member = memberList.get(index);

            } else {
                throw new InvalidMemberException("Member do not exist, please select the right member index.");
            }
        } catch (InvalidMemberException e) {
            throw new InvalidMemberException(e.getMessage());
        }
        return member;
    }

    /**
     * Delete member as request by user.
     *
     * @param memberNumber member number given by user
     * @return member to be displayed as deleted
     * @throws IndexOutOfBoundsException When an invalid member is selected to be deleted
     */
    public Member deleteMember(int memberNumber) throws IndexOutOfBoundsException {
        try {
            int index = memberNumber - 1;
            Member task = memberList.get(index);
            memberList.remove(index);
            return task;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

}
