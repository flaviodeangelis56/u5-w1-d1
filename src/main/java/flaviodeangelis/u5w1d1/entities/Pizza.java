package flaviodeangelis.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pizza {
    private String pizzaName;
    private List<String> ingredients;
    private int calories;
    private double price;
}
