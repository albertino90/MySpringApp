package com.springtest.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CardDTO {
    private Long id;
    //при названии enWordDTO/ruWordDTO возвращает null и нужно прописывать @Mapping в маппере либо убирать *DTO из названия
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
    private Long rating;

}




