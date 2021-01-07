package me.bingbingpa.domain;

import lombok.*;

@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardFree extends Board {

    private Long boardFreeId;
}
