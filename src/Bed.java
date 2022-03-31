/**
 * ERROR 4 YOU
 *
 *
 * @ClassName: Bed
 * @Description: E4Y
 * @author: Bruce Young
 * @date: 2022 . 03 . 31
 */
public class Bed extends Point {
    public Bed(int x, int y) {
        super(x, y);
    }

    /**
     * E4Y
     */
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
