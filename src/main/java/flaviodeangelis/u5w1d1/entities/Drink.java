package flaviodeangelis.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Drink {
    private String drinkName;
    private int calories;
    private double price;
}
