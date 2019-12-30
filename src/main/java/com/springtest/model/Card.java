package com.springtest.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "cards")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private EnWord enWord;

    @ManyToOne
    private RuWord ruWord;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;

    private Long rating;

}
