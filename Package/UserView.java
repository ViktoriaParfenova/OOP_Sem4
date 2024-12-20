package Package;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface UserView<T extends User> {
    public void sendOnConsole(List<T> students);
}