package servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OutputStream os = null;
		os = response.getOutputStream();
		response.setHeader("Content-type", "text/html;charset=UTF-8"); 
		String data = "{\r\n" + 
				"  \"ret\": true,\r\n" + 
				"  \"data\": {\r\n" + 
				"    \"allSections\": [{\r\n" + 
				"      \"label\": \"办公室\",\r\n" + 
				"      \"value\": \"办公室\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"运营中心\",\r\n" + 
				"      \"value\": \"运营中心\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"摄影中心\",\r\n" + 
				"      \"value\": \"摄影中心\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"研发中心\",\r\n" + 
				"      \"value\": \"研发中心\"\r\n" + 
				"    }],\r\n" + 
				"    \"allDuties\": [{\r\n" + 
				"      \"label\": \"工作室主任\",\r\n" + 
				"      \"value\": \"工作室主任\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"部长\",\r\n" + 
				"      \"value\": \"部长\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"副部长\",\r\n" + 
				"      \"value\": \"副部长\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"部委\",\r\n" + 
				"      \"value\": \"部委\"\r\n" + 
				"    }],\r\n" + 
				"    \"allProvinces\": [{\r\n" + 
				"      \"label\": \"北京市\",\r\n" + 
				"      \"value\": \"北京市\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"天津市\",\r\n" + 
				"      \"value\": \"天津市\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"上海市\",\r\n" + 
				"      \"value\": \"上海市\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"重庆市\",\r\n" + 
				"      \"value\": \"重庆市\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"河北省\",\r\n" + 
				"      \"value\": \"河北省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"山西省\",\r\n" + 
				"      \"value\": \"山西省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"辽宁省\",\r\n" + 
				"      \"value\": \"辽宁省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"吉林省\",\r\n" + 
				"      \"value\": \"吉林省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"黑龙江省\",\r\n" + 
				"      \"value\": \"黑龙江省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"江苏省\",\r\n" + 
				"      \"value\": \"江苏省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"浙江省\",\r\n" + 
				"      \"value\": \"浙江省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"安徽省\",\r\n" + 
				"      \"value\": \"安徽省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"福建省\",\r\n" + 
				"      \"value\": \"福建省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"江西省\",\r\n" + 
				"      \"value\": \"江西省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"山东省\",\r\n" + 
				"      \"value\": \"山东省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"河南省\",\r\n" + 
				"      \"value\": \"河南省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"湖北省\",\r\n" + 
				"      \"value\": \"湖北省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"湖南省\",\r\n" + 
				"      \"value\": \"湖南省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"广东省\",\r\n" + 
				"      \"value\": \"广东省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"海南省\",\r\n" + 
				"      \"value\": \"海南省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"四川省\",\r\n" + 
				"      \"value\": \"四川省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"贵州省\",\r\n" + 
				"      \"value\": \"贵州省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"云南省\",\r\n" + 
				"      \"value\": \"云南省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"陕西省\",\r\n" + 
				"      \"value\": \"陕西省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"甘肃省\",\r\n" + 
				"      \"value\": \"甘肃省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"青海省\",\r\n" + 
				"      \"value\": \"青海省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"台湾省\",\r\n" + 
				"      \"value\": \"台湾省\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"内蒙古自治区\",\r\n" + 
				"      \"value\": \"内蒙古自治区\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"广西壮族自治区\",\r\n" + 
				"      \"value\": \"广西壮族自治区\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"西藏自治区\",\r\n" + 
				"      \"value\": \"西藏自治区\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"宁夏回族自治区\",\r\n" + 
				"      \"value\": \"宁夏回族自治区\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"新疆维吾尔自治区\",\r\n" + 
				"      \"value\": \"新疆维吾尔自治区\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"香港特别行政区\",\r\n" + 
				"      \"value\": \"香港特别行政区\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\": \"澳门特别行政区\",\r\n" + 
				"      \"value\": \"澳门特别行政区\"\r\n" + 
				"    }]\r\n" + 
				"  }\r\n" + 
				"}";  
		os.write(data.getBytes("UTF-8")); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
