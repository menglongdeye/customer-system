//package com.lcl.galaxy.search.service.provider.ikremote;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class DictionaryService {
//
//	@Autowired
//	private DictionaryMapper dictionaryMapper;
//
//	public long getLastUpdateTime() {
//		// 获取数据库最新的更新时间
//		return dictionaryMapper.findLastedUpdateTime().getTime();
//	}
//
//	public List<String> getWords(long lastModified) {
//
//		Date lastModifiedDate = new Date(lastModified);
//		return dictionaryMapper.findByUpdateTime(lastModifiedDate).stream().map(ExtensionWord::getWord)
//				.collect(Collectors.toList());
//
////		return dictionaryMapper.findAll().stream().map(ExtensionWord::getWord).collect(Collectors.toList());
//	}
//}
