package com.icia.cheatingday.notice.dto;

import java.time.*;
import lombok.*;
import lombok.experimental.*;

public class NoticeDto {
	private NoticeDto() { }
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	@Accessors(chain = true)
	public static class DtoForList{
		private int nNo;
		private String nTitle;
		private String aUsername;
		private String nWriteTimeStr;
		private int nReadCnt;
	}
	
	@Data
	@Accessors(chain=true)
	public static class DtoForRead {
		private Integer nNo;
		private String nTitle;
		private String nWriteTimeStr;
		private Integer nReadCnt;
		private String content;
		private String aUsername;
	}
	@Data
	@Accessors(chain=true)
	public static class DtoForWrite {
		private String nTitle;
		private String content;
		private String aUsername;
	}
}
