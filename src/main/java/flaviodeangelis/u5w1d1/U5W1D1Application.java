package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Menù;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
@Slf4j
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        configurationMenù();
    }

    public static void configurationMenù() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        //      List<Pizza> pizze = new ArrayList<>();
        //      List<Topping> ingredienti = new ArrayList<>();
        //    List<Drink> bevande = new ArrayList<>();
        //     System.out.println("PIZZE");
        //    Pizza margherita = (Pizza) ctx.getBean("getMargherita");
        //    System.out.println("Name :" + margherita.getPizzaName() + ", Calories :" + margherita.getCalories() + ", Price :" + margherita.getPrice() + ", Ingredients :" + margherita.getIngredients());
        //     Pizza diavola = (Pizza) ctx.getBean("getDiavola");
        //    System.out.println("Name :" + diavola.getPizzaName() + ", Calories :" + diavola.getCalories() + ", Price :" + diavola.getPrice() + ", Ingredients :" + diavola.getIngredients());
        //     pizze.add(margherita);
        //    pizze.add(diavola);
        //      System.out.println("INGREDIENTI");
        //   Topping pomodoro = (Topping) ctx.getBean("getPomodoro");
        //    System.out.println("Name :" + pomodoro.getIngredient() + ", Calories :" + pomodoro.getCalories() + ", Price :" + pomodoro.getPrice());
        //    Topping mozzarella = (Topping) ctx.getBean("getMozzarella");
        //    System.out.println("Name :" + mozzarella.getIngredient() + ", Calories :" + mozzarella.getCalories() + ", Price :" + mozzarella.getPrice());
        //   Topping salamePiccante = (Topping) ctx.getBean("getSalamePiccante");
        //   System.out.println("Name :" + salamePiccante.getIngredient() + ", Calories :" + salamePiccante.getCalories() + ", Price :" + salamePiccante.getPrice());
        //     ingredienti.add(pomodoro);
        //       ingredienti.add(mozzarella);
        //    ingredienti.add(salamePiccante);
        //   System.out.println("BEVANDE");
        //  Drink acqua = (Drink) ctx.getBean("getAcqua");
        //  System.out.println("Name :" + acqua.getDrinkName() + ", Calories :" + acqua.getCalories() + ", Price :" + acqua.getPrice());
        // Drink cocaCola = (Drink) ctx.getBean("getCola");
        //  System.out.println("Name :" + cocaCola.getDrinkName() + ", Calories :" + cocaCola.getCalories() + ", Price :" + cocaCola.getPrice());
        //      bevande.add(acqua);
        //     bevande.add(cocaCola);
        Menù menù = (Menù) ctx.getBean("getMenù");
        System.out.println("PIZZE");
        menù.getPizzas().forEach(System.out::println);
        System.out.println("INGREDIENTI");
        menù.getToppings().forEach(System.out::println);
        System.out.println("BEVANDE");
        menù.getDrinks().forEach(System.out::println);
        ctx.close();
    }
}
