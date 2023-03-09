//package hellojpa;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Team {
//
//    @Id @GeneratedValue
//    @Column(name = "TEAM_ID")
//    private Long id;
//    private String name;
//    // 관례로 이렇게 한다. 널포인트 엘에러가 안뜨니까
//
//    @OneToMany(mappedBy = "team")
//    private List<TeamMember> members = new ArrayList<>();
//
//    public void addMember(TeamMember member) {
//        member.setTeam(this);
//        members.add(member);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<TeamMember> getMembers() {
//        return members;
//    }
//
//    public void setMembers(List<TeamMember> members) {
//        this.members = members;
//    }
//
//    @Override
//    public String toString() {
//        return "Team{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", members=" + members +
//                '}';
//    }
//}
