package sk.ableneo.openslava2023.codefix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sk.ableneo.openslava2023.donotfix.Order;
import sk.ableneo.openslava2023.donotfix.Product;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class BalloonChallengeTest {

    @Mock
    private BalloonChallenge balloonChallenge;

    @BeforeEach
    void setUp() {
        when(balloonChallenge.getAllOrders()).thenReturn(
                new ArrayList<Object>(Arrays.asList(
                        new Order(new ArrayList<>(Arrays.asList(new Product("hot air balloon")))),
                        new Order(new ArrayList<>(Arrays.asList(new Product("gas balloon")))),
                        new Order(new ArrayList<>(Arrays.asList(new Product("gas balloon"))))
                ))
        );
        when(balloonChallenge.findOrdersForProduct(any(),anyBoolean())).thenCallRealMethod();
    }
    @Test
    void findOrdersForProduct() {
        assertEquals(1, balloonChallenge.findOrdersForProduct(new Product("hot air balloon"), false).size());
        assertEquals(2, balloonChallenge.findOrdersForProduct(new Product("gas balloon"), false).size());
    }
}
