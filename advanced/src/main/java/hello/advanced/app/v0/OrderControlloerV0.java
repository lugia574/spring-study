package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller + ResponseBody 를 합친게 RestController 입니다잉
@RestController
@RequiredArgsConstructor
public class OrderControlloerV0 {

    private final OrderServiceV0 orderService;

    @GetMapping("/v0/requset")
    public String requestOrder(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }
}
