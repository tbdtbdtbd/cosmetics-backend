package com.teamtbd.cosmetics.product.service;

import com.teamtbd.cosmetics.product.Product;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void getProductFromJsonObject() throws ParseException {
        JSONObject jsonObject = (JSONObject) new JSONParser().parse("{\n" +
                "  \"id\": \"9868e621-63da-4210-999f-f6910f206cd7\",\n" +
                "  \"name\": \"바이오더마 센시비오 토너 250ml\",\n" +
                "  \"price\": \"27000\",\n" +
                "  \"brand\": \"바이오더마\",\n" +
                "  \"category\": \"1\",\n" +
                "  \"site\": 1,\n" +
                "  \"site_id\": \"A000000002839\",\n" +
                "  \"site_category\": \"100000100010008\",\n" +
                "  \"link\": \"https://www.oliveyoung.co.kr/store/goods/getGoodsDetail.do?goodsNo=A000000002839&dispCatNo=100000100010008&trackingCd&curation&egcode&rccode&egrankcode\",\n" +
                "  \"image_url\": \"https://image.oliveyoung.co.kr/uploads/images/goods/400/10/0000/0000/A00000000283907ko.jpg?l=ko\",\n" +
                "  \"volume\": \"250ml\",\n" +
                "  \"expiration_date\": \"제조일로부터 3년 이내의 상품을 순차적으로 발송/ 개봉 후 6개월 사용 권장\",\n" +
                "  \"usage\": \"세안 후 화장솜에 적당량을 덜어 부드럽게 패딩해줍니다. \",\n" +
                "  \"origin\": \"프랑스\",\n" +
                "  \"ingredients\": \"정제수, 글리세린, 자일리톨, 폴리솔베이트20, 피이지-40하이드로제네이티드캐스터오일, 다이소듐이디티에이, 알란토인, 세트리모늄브로마이드, 프로필렌글라이콜, 오이열매추출물, 프룩토올리고사카라이드, 만니톨, 소듐하이드록사이드, 시트릭애씨드, 람노오스 ※제공된 성분은 동일 제품이라도 경우에 따라 변경될 수 있습니다. 최신정보는 제품 포장의 성분을 참고하시거나 본사 고객센터(02-523-7676)으로 연락 부탁 드립니다\",\n" +
                "  \"caution\": \"1) 화장품 사용 시 또는 사용 후 직사광선에 의하여 사용부위가 붉은 반점, 부어오름 또는 가려움증 등의 이상 증상이나 부작용이 있는 경우 전문의 등과 상담할 것 2) 상처가 있는 부위 등에는 사용을 자제할 것 3) 보관 및 취급 시의 주의사항 가. 어린이의 손이 닿지 않는 곳에 보관할 것 나. 직사광선을 피해서 보관할 것  \"\n" +
                "}");

        Product product = productService.getProductFromJsonObject(jsonObject);
        assertEquals("바이오더마 센시비오 토너 250ml", product.getName());
    }
}