@Entity
public class demoClass extends AbstractEntity {
//    The acceptance criteria for this API is as follows:
//            1.	id [int] greater than zero
//2.	name [String] can't be longer than 10 alpha characters
//            3.	last [String] can't be longer than 10 alpha characters
//            4.	age [int] must be integer and 0 > age < 120
//            5.	gender [String] must only be F or M
//6.	response time must be less than 500ms
@Size(min = 500, message = "greater than zero")
    public int id;

@Size(min = 500, message = "last can't be longer than 10 alpha characters")
    public String name;

@Size(min = 500, message = "must be integer and 0 > age < 120")
    public int age;

@Size(min = 500, message = "must only be F or M")
    public String gender;

@Size(min = 500, message = "response time must be less than 500ms")
    public String response;
}
