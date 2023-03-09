package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        // code
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            BookStore bookStore1 = new BookStore();
            bookStore1.setName("bookstore1");
            bookStore1.setLocation("강서구");
            em.persist(bookStore1);

//
//            Member member = new Member();
//            member.setAddress("강서구");
//            member.setEmail("123@naver.com");
//            member.setNickname("냥냥펀치");
//            member.setPassword("1234");
//            member.setPhoneNumber("1234-1234");
//            em.persist(member);

            BookStore bookStore2 = new BookStore();
            bookStore2.setName("bookstore2");
            bookStore2.setLocation("용산구");
//            bookStore2.setMember((List<Member>) member);
            em.persist(bookStore2);

            BookStore bookStore3 = new BookStore();
            bookStore3.setName("bookstore3");
            bookStore3.setLocation("강남구");
            em.persist(bookStore3);

//            Book book = new Book();
//            book.setName("book1");
//            book.setBookStore(bookStore2);
//            book.setAuthor("류");
//            book.setPrice(10000);
//            book.setQuantity(5);
//            em.persist(book);
//            book.setBookStore(bookStore1);
//            Purchase purchase = new Purchase();
//            em.persist(purchase);

//            em.flush();
//            em.clear();

//            BookStore findBookStore = em.find(BookStore.class, bookstore.getId());
//            List <Book> books = findBookStore.getBooks();
//            for(Book b : books ){
//                System.out.println("b = " + b);
//            }
//
//            String name = book2.getBookStore().getName();
//            System.out.println("name = " + name);

//            Team team = new Team();
//            team.setName("TeamA");
////            team.getMembers().add(member);
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.chaneTeam(team);  //**
//            em.persist(member);

//            team.addMember(member);
//            team.getMembers().add(member);  // 이 작업을 members 안의 setTeam에서 해두기

            // db에서 값을 가져오게 함
//            em.flush();
//            em.clear();

//            Team findTeam = em.find(Team.class, team.getId());  // 1차 캐시
//            List<Member> members = findTeam.getMembers();
//            System.out.println("==========");
//            for(Member m : members){
//                 System.out.println("members = " + findTeam);
//            }
//            System.out.println("==========");

            
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}