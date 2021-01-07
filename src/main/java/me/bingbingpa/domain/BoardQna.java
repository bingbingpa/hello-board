package me.bingbingpa.domain;

import lombok.*;

@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardQna extends Board {

    private Long boardQnaId;
}
