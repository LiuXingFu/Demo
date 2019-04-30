package lxf.incast.Img;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年4月28日 下午2:30:59
 */
@Controller
public class ImgController {

	private static final String path = "D:\\String\\user_img\\";

	@RequestMapping(value = "/img.lxf", method = { RequestMethod.POST, RequestMethod.GET })
	public String Img(MultipartFile fileImg, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String uuidImg = UUID.randomUUID().toString();
		String oriName = fileImg.getOriginalFilename();
		String extName = oriName.substring(oriName.lastIndexOf("."));
		fileImg.transferTo(new File(path + uuidImg + extName));

		
		request.setAttribute("img", uuidImg + extName);

		return "img";
	}

	@RequestMapping("/oo")
	public String fileImg() {
		return "fileImg";
	}

}
