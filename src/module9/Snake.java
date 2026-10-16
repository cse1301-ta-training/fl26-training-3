package module9;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<BodySegment> body;

    public Snake() {
        body = new ArrayList<BodySegment>();
        body.add(new BodySegment(5, 5));
        body.add(new BodySegment(4, 5));
        body.add(new BodySegment(3, 5));
    }

    public void move(int deltaX, int deltaY) {
        // This code has a bug. Fix it so each segment moves to the old
        // position of the segment in front of it.
        BodySegment head = body.get(0);
        head.setPosition(head.getX() + deltaX, head.getY() + deltaY);

        for (int i = 1; i < body.size(); i++) {
            BodySegment previous = body.get(i - 1);
            BodySegment current = body.get(i);
            current.setPosition(previous.getX(), previous.getY());
        }
    }

    public String toString() {
        return body.toString();
    }
}
