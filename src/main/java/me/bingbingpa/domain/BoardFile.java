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
public class BoardFile {

	private String sharing;
	private String dataType;

	// 고유번호
	private Long boardFileId;
	// 사용자 업로드 정보 고유번호
	private Long boardId;
	// 사용자 아이디
	private String userId;
	// 사용자명
	private String userName;
	// 파일 이름
	private String fileName;
	// 파일 실제 이름
	private String fileRealName;
	// 파일 경로
	private String filePath;
	// 공통 디렉토리 이하 부터의 파일 경로
	private String fileSubPath;
	// 파일 사이즈
	private String fileSize;
	// 파일 확장자
	private String fileExt;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime insertDate;
}
