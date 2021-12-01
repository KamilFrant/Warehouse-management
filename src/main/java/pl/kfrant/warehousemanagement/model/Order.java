package pl.kfrant.warehousemanagement.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int count;
    private float cost;

    public Order(String name, int count, int cost) {
        this.name = name;
        this.count = count;
        this.cost = cost;
    }
}
