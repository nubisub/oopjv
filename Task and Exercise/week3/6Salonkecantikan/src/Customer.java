public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }
    public String getMemberType() {
        if (member) {
            return memberType;
        } else {
            return "not a member";
        }
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public String toString(){
        return "Customer: " + name + ", member :" +  getMemberType() ;
    }
}
