package ReDay15Assignment.cinema.kaifamiao_cinema;

/**
 * ClassName:User
 * Package: assignment.cinema
 * Description:
 *
 * @Author Neko
 * @Create 19/8/20234:20 pm
 * @Version 1.0
 */
public class User {
    private String username;
    private Long phone;
    private String password;
    private int role;//1是管理员，2是普通用户
    private static Ticket[] tickets;//已购买的电影票
    private static int ticketCount;

    {
        tickets = new Ticket[10];
    }

    public static Ticket[] getTickets() {
        return tickets;
    }

    public static void setTickets(Ticket[] tickets) {
        User.tickets = tickets;
    }


    public void addTicket(Ticket ticket) {
        this.tickets[ticketCount++]=ticket;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return this.username;
    }

    public long getPhone() {
        return this.phone;
    }

    public String getPassword() {
        return this.password;
    }

    public int getRole() {
        return this.role;
    }


    public User() {
    }

    public User(String username, Long phone, String password, int role) {
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }


    @Override
    public String toString() {
        return "User: { Username: " + this.username + " Phone: " + this.phone + " Password: " + this.password + " Role: " + this.role + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {//先判断是不是一个类的
            return false;
        } else if (this == obj) {//再判断地址值
            return true;
        }
        User temp = (User) obj;//先转换类型再做判断
        return this.username.equals(temp.username) && this.phone == temp.phone && this.password == temp.password && this.role == temp.role;//这里全是判断，逻辑不通过为false
    }


}


