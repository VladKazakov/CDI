package ru;


import javax.inject.Inject;
import java.util.Random;

/**
 * Created by vlad on 21.03.17.
 */
public class IsbnGenerator implements NumberGenerator  {

    @Override
    @Inject
    public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
    }
}
