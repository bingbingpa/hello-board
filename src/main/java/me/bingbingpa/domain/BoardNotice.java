package me.bingbingpa.domain;

import lombok.*;

@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardNotice extends Board{

    private Long boardNoticeId;
}
