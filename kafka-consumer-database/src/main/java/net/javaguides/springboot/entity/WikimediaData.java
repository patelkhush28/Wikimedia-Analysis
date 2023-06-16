package net.javaguides.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class WikimediaData {

    @Lob
    private String wikiEventData;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
