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
public class Board {

	// 댓글 개수
	private Integer commentCount;

	/*********** 테이블 *************/
	// 게시물 상세 고유번호
	private Long boardDetailId;
	// 내용
	private String contents;
	// 게시판 댓글 고유번호
	private Long boardCommentId;
	// comment
	private String comment;

	// 고유번호
	private Long boardId;
	// 제목
	private String title;
	// 사용자 아이디
	private String userId;
	// 사용자 이름
	private String userName;
	// 게시 시작시간
	private String startDate;
	private String startDay;
	private String startHour;
	private String startMinute;
	// 게시 종료시간
	private String endDate;
	private String endDay;
	private String endHour;
	private String endMinute;

	// 사용유무, true : 사용, false : 사용안함
	private Boolean available;
	// 요청 IP
	private String clientIp;
	// 조회수
	private Long viewCount;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updateDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime insertDate;

}
