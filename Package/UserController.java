package Package;

@SuppressWarnings("rawtypes")
public interface UserController <T extends User>{
    T create(int id, String surname, String name, String patronymic, int age);
}