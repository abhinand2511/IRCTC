package ticket.Booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.Booking.entities.User;

import java.io.File;
import java.util.List;

public class UserBookingService {
    private User user;
    private List<User> userList;
    private ObjectMapper objectMapper  = new ObjectMapper()
    private static final String USERS_PATH = "../localDb/users.json"
    public UserBookingService(User user){
        this.user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        })
    }
}
