package com.icia.cheatingday.common.dto;


import java.util.*;

import com.icia.cheatingday.admin.dto.*;
import com.icia.cheatingday.center.dto.*;
import com.icia.cheatingday.freeboard.dto.*;
import com.icia.cheatingday.notice.dto.*;
import com.icia.cheatingday.user.dto.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Page {
	private int startRowNum;
	private int endRowNum;
	private int pageno;
	private int startPage;
	private int endPage;
	private boolean isPrev;
	private boolean isNext;
	List<NoticeDto.DtoForList> nlist;
	List<PointDto.DtoForList> plist;
	List<QnADto.DtoForList> qlist;
	List<AdminDto.DtoForList> alist;
	List<FreeBoardDto.DtoForLIst> freelist;
}
