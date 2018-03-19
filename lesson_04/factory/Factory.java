package factory;

import java.util.Random;

public class Factory {
    private Random random;

    public Factory(Random random) {
        this.random = random;
    }

    public Factory() {
        random = new Random();
    }

    private int generatePrice() {
        return 50000 + random.nextInt(100) * 100;
    }

    private int generateYear() {
        return 2000 + random.nextInt() * 18;
    }

    private int generateSpeed() {
        return 80 + random.nextInt() * 100;
    }

    private int generateX() {
        return random.nextInt() * 10;
    }

    private int generateY() {
        return random.nextInt() * 10;
    }
}
