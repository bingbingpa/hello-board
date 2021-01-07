package me.bingbingpa.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@ToString(callSuper = true)
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardComment {

	// 사용자 이름
	private String userName;
	// 고유번호
	private Long boardCommentId;
	// 게시판 고유번호
	private Long boardId;
	// 조상
	private Long ancestor;
	// 부모
	private Long parent;
	// 깊이
	private Long depth;
	// 사용자 아이디
	private String userId;
	// 댓글(Comment)
	private String content;
	// 요청 IP
	private String clientIp;
	// 추천수
	private String likeCount;
	// 등록일
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime insertDate;
}
