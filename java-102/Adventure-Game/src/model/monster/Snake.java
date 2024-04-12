package model.monster;

import model.BaseEntity;

import java.util.Random;

public class Snake extends BaseEntity {
    private static final Random random = new Random();

    public Snake() {
        super("Snake", random.nextInt(3, 7), 12, 0);
    }
}