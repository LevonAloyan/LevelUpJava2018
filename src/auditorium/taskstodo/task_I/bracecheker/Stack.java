package auditorium.taskstodo.task_I.bracecheker;

//TODO: implement this interface dinamicaly in the same package.
public interface Stack <T> {

    void push(T v);

    T    pop();

    boolean isEmpty();

    void reset();
}