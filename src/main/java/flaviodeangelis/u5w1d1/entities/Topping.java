package flaviodeangelis.u5w1d1.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Topping {
    private String ingredient;
    private int calories;
    private double price;

}
