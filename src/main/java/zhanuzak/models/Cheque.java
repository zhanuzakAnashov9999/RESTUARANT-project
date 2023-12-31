package zhanuzak.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@Entity
@Table(name = "cheques")
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Cheque {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cheque_seq")
    @SequenceGenerator(name = "cheque_seq",allocationSize = 1)
    private Long id;
    @Column(name = "price_average")
    private BigDecimal priceAverage;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @ManyToOne(cascade = {MERGE,REFRESH,DETACH,PERSIST})
    private User user;
    @Column(name = "menu_items")
    @ManyToMany(mappedBy = "cheques",cascade = {MERGE,REFRESH,DETACH,PERSIST})
    private List<MenuItem> menuItems;



}