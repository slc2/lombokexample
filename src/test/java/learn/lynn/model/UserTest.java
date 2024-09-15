package learn.lynn.model;

public class UserTest {
    public void testUser() {
        User user =  User.builder()
                .firstName("Lynn")
                .lastName("Cohen")
                .email("foo@xyz.com")
                .build();
        assert(user.getFirstName().equals("Lynn"));
    }
}
