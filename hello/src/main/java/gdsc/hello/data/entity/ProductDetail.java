package gdsc.hello.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_detail")
@Getter @Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProductDetail extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne
    @JoinColumn(name = "product_number")
    private Product product;

}
