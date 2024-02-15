package com.frank.demointer.network

import com.frank.demointer.models.BaseResponse
import com.frank.demointer.models.lazada.LazadaData
import com.frank.demointer.models.lazada_list.LazadaListData
import com.frank.demointer.models.lazada_list.Result
import com.frank.demointer.models.shopee.Data
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {

    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
        "Af-Ac-Enc-Dat: AAczLjQuMS0yAAABjX56MT8AABERAzAAAAAAAAAAAv+Jk48S5p7olfvwn34XQN5E76dIl/82EyfDx/bVRcPaaRvYm5f/NhMnw8f21UXD2mkb2Jusx0O7MMK/GrA4nbHTbkvTjgYkn7IeozNXGVZcjxP4ZhU4KI1KEFXWh+LvIIYNtFbSAArCr3CV6bzZn1izzLlGXUz9VU/cIZtYciXiqTb6Al0l9cz6IPqeHwPmZrdP4Irj9g3P4lCO9Z2wZ7mdsCt2nzNXgiRqSZLbgNI2iieL97M34fcemivCwVj/wSTOHQ45X7yVYI6nUJwNRLBr06jbasHiLGKq27wpWWZIXvfvf/OvAFxWOUGrrG9wvs9t4EWtF2e4JYpfHm7eD61aAKrSB/0EnmuaXM8yBzVUNBzbPprROMJkcN15n4kILPQyPRq0AntGfasU53wS90KRUkfUQgFqSO+Kjkx02Jlm8cFNXuw4XwlboXSrhzYEylKOuxoKWrOnq6+YUWe5XcPDKt+KQgFqSO+Kjkx02Jlm8cFNXqKSaxyyekOJL+c7ULfKHELahYF5hK6+uNPPhgQOU/pYy8W6LkL4KiSFzjuz0gQUiwYNS2kSk1JIjSg63e1qA5O20y7c/eq7SlPBfkItD4rubE8OphWhMES3ji7wSLmvMgYNS2kSk1JIjSg63e1qA5MIAm4uCJVlJ4EeyMKglgyqtc2HH7SGYTUvSO0TIC2YjK1WNFo2LwuoLW6+6oJffmDZ/LVugzryiAhVJqYGMH8v2wfkG43shRAgikvMIvrV+Oi/qFkNtyZz+CpnJqmDo6SsBFfai1x8HjOoMvLEx6daYGlVhKGCfwtcvyanteRD6CjdC+ncpLuB7EDsgrmHtqhuyDFQgmpny+B7iEVVONockhNBLjm1h17osrvnSCzxcR/78BAI9woJ/0NIQ93qwPAjH2lb8EwcGlfir0kOI9INl/82EyfDx/bVRcPaaRvYm5IZNwCqWe3fA4mzOZkovjqaSwVgo63gkD6Hi7NqhmotT14xBhlstwzFVbpGSg7PtpJ68XiqkGq9lTZ3K+GLgZ8zEAUFn/3Mk+baq/KMuEFiT14xBhlstwzFVbpGSg7PtsnUZOQXO2C1lAp1eFriGtQ=",
        "Af-Ac-Enc-Sz-Token: Xv2N2+AvD5NojMFdZ22/YQ==|pkfU0n9JcOQNchOV3FSSY9LkeBVhhbq9WUkj2rPTPk4e5mK+BBnoLaltYYMpfqUNODrIp13Go+1rKw==|J7QNVjamNNEkBldM|08|3",
        "Cookie: REC_T_ID=f3585832-727c-11ec-8112-b47af14ae888; SPC_F=7XqoTGwyJdD2Q9ZrnHhfnFIIAuTY7mct; _hjSessionUser_868286=eyJpZCI6ImQxOWQ3YjJlLTJlN2EtNTUzMy05NWQ5LTJlOTg4ZjY3NTg4ZiIsImNyZWF0ZWQiOjE2NDE4NjQxNTQ4MDIsImV4aXN0aW5nIjp0cnVlfQ==; G_ENABLED_IDPS=google; SPC_T_IV=\"DbuqA5s7Cvkh+U2ygy+wvw==\"; SPC_T_ID=\"Luc68xK1wb4omgPfeobQQLgS2QVFA6xWGxxnjpy3JC7el2GTIgWj8GfMVTgzUQz1FZBgQa1YUXnPH01xJWTluEKxXGVgdcBF1fyOfS2Ra/Q=\"; _hjid=3759e529-233c-4276-a396-2feeb3d4abcf; SPC_CLIENTID=N1hxb1RHd3lKZEQythxuekrmsbxlexvq; SPC_U=-; SPC_EC=-; SPC_T_IV=S2JNRnZPdGJnUkRxQmd6cg==; SPC_R_T_ID=C+eVaE3fG3vZj0kcB9PufN5YyQqAGY+1/0GavRzvvO6TVzPvZiXQ4HnWvP4DDUDtph/30vA4n5j5VhFa/CgEDjzbUKMUGPqwcSFdYRqq1d0W43KNk+MK+ZJpz5+jw4QWwAjh9wPyNfbcbvB5qp9A9IKugcFCS2ADlykw5C/G8lY=; SPC_R_T_IV=S2JNRnZPdGJnUkRxQmd6cg==; SPC_T_ID=C+eVaE3fG3vZj0kcB9PufN5YyQqAGY+1/0GavRzvvO6TVzPvZiXQ4HnWvP4DDUDtph/30vA4n5j5VhFa/CgEDjzbUKMUGPqwcSFdYRqq1d0W43KNk+MK+ZJpz5+jw4QWwAjh9wPyNfbcbvB5qp9A9IKugcFCS2ADlykw5C/G8lY=; _fbp=fb.1.1691904807517.387390270; _fbc=fb.1.1698075651097.IwAR2-UI1I63lUInL1eaqEQaZx92aeW4C6e9GUAbwMhx6AAo7KFIeeuWoOJQU; language=vi; _ga_M32T05RVZT=GS1.1.1698075653.48.1.1698078121.60.0.0; _gcl_au=1.1.1789534867.1702695469; __LOCALE__null=VN; csrftoken=ukcYCccvPGunr0z9sTBkyeeJJTKRnhEY; SPC_SI=O/LBZQAAAABRRkNhTzZyc2UkBQAAAAAAVWpoOE1HbnU=; SPC_SEC_SI=v1-ajlhNWxETU9SZ2pjd2dsMTCDzor7OOwPJ9sNtKbhPEmX55d6xPmLtSELsJN+qMoCQnj8sQ+ZYAjB+L6Y2SVMucreOeJ5F92zHt8vbfcboMg=; _sapid=5f5a1f8ecf71ddeb206cbe6c98679b2ad0bd5c15f0f13635931a57f5; _QPWSDCXHZQA=2c6334a4-1a85-46c4-e299-ed26d5a3b7a6; REC7iLP4Q=7dfd7c5f-ea31-43d2-a987-9445a45a4911; shopee_webUnique_ccd=Xv2N2%2BAvD5NojMFdZ22%2FYQ%3D%3D%7CpkfU0n9JcOQNchOV3FSSY9LkeBVhhbq9WUkj2rPTPk4e5mK%2BBBnoLaltYYMpfqUNODrIp13Go%2B1rKw%3D%3D%7CJ7QNVjamNNEkBldM%7C08%7C3; ds=93301cc25370740d42ad094e066e0ba2; _ga=GA1.1.2134971423.1641864154; _hjSession_868286=eyJpZCI6ImZkNzcxYTk1LTEzODUtNGFhYy04YTA4LTNiNDBjZTNjNGQ5YiIsImMiOjE3MDcyMjM5NTk1NDksInMiOjAsInIiOjAsInNiIjowLCJzciI6MCwic2UiOjAsImZzIjowLCJzcCI6MX0=; AMP_TOKEN=%24RETRIEVING; _ga_4GPP1ZXG63=GS1.1.1707223959.2.0.1707223960.0.0.0; SPC_R_T_ID=C+eVaE3fG3vZj0kcB9PufN5YyQqAGY+1/0GavRzvvO6TVzPvZiXQ4HnWvP4DDUDtph/30vA4n5j5VhFa/CgEDjzbUKMUGPqwcSFdYRqq1d0W43KNk+MK+ZJpz5+jw4QWwAjh9wPyNfbcbvB5qp9A9IKugcFCS2ADlykw5C/G8lY=; SPC_R_T_IV=S2JNRnZPdGJnUkRxQmd6cg==; SPC_SI=O/LBZQAAAABRRkNhTzZyc2UkBQAAAAAAVWpoOE1HbnU=; SPC_T_ID=C+eVaE3fG3vZj0kcB9PufN5YyQqAGY+1/0GavRzvvO6TVzPvZiXQ4HnWvP4DDUDtph/30vA4n5j5VhFa/CgEDjzbUKMUGPqwcSFdYRqq1d0W43KNk+MK+ZJpz5+jw4QWwAjh9wPyNfbcbvB5qp9A9IKugcFCS2ADlykw5C/G8lY=; SPC_T_IV=S2JNRnZPdGJnUkRxQmd6cg==",
        "If-None-Match-: 55b03-459b132cacae4d79ad4e302bffe58d34",
        "Referer: https://shopee.vn/",
        "Sec-Ch-Ua: \"Google Chrome\";v=\"119\", \"Chromium\";v=\"119\", \"Not?A_Brand\";v=\"24\"",
        "Sec-Ch-Ua-Mobile: ?0",
        "Sec-Ch-Ua-Platform: \"macOS\"",
        "Sec-Fetch-Dest: empty",
        "Sec-Fetch-Mode: cors",
        "Sec-Fetch-Site: same-origin",
        "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36"
    )
    @GET("/api/v4/homepage/get_daily_discover")
    fun getListShopee(
        @Query("bundle") bundle: String = "daily_discover_main",
        @Query("item_card") itemCard: Int = 1,
        @Query("limit") limit: Int = 20,
        @Query("need_tab") needTab: Boolean = false,
        @Query("offset") offset: Int = 0,
        @Query("view_session_id") viewSessionId: String = "2051404c-b801-408a-9446-1f89874593b9",
    ): Call<BaseResponse<Data>>


    @Headers(
        "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36",
        "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"
    )
    @GET("")
    fun getListTikTok(
        @Url url: String = "https://api.tiktokv.com/aweme/v1/challenge/aweme/?ch_id=1666225759256578&count=20&offset=0&max_cursor=0&type=5&query_type=0&is_cold_start=1&pull_type=1&cursor=0",
    ): Call<ResponseBody>
}

interface ApiLazadaService {

    @Headers(
        "authority: acs-m.lazada.vn",
        "accept: application/json",
        "accept-language: vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
        "content-type: application/x-www-form-urlencoded",
        "cookie: t_fv=1696297265756; t_uid=WM0KqM1JXym7I4gWj4sgXJ9wKVFpz94V; cna=M1+iHXBdsTgCAWgc3knquoSY; hng=VN|vi|VND|704; hng.sig=EmlYr96z9MQGc5b9Jyf9txw1yLZDt_q0EWkckef954s; lwrid=AQGNqMlDbzcMV7vbafn6xe5uI%2FYQ; lzd_cid=2846c94f-7cea-449d-da9e-5e8e3dea4e7b; _gcl_au=1.1.107585883.1707933785; xlly_s=1; lzd_sid=145c375776ec2a2de64a05e93ddfed8c; _tb_token_=5a06be6e0eb4e; _m_h5_tk=aee13d1e6a6ac7fe81a5485665600c99_1707977949016; _m_h5_tk_enc=952e7887bc221782ccfddaa817951b66; t_sid=KyXA6bE0TUJzeelWab3E5B3zJJyyzAP6; utm_channel=NA; x5sec=7b22617365727665722d6c617a6164613b33223a22617c434d712f74713447454e66546b6148362f2f2f2f2f77456943584a6c5932467764474e6f595444367a7275692f662f2f2f2f3842536a41774d5441775a6d59774d4441774d4441774d4441774f4441774d4441774d4451324f44466a5a6d5530595467334f4751324f4755774d4441774d4441774d44413d222c22733b32223a2230306539376431323930316530376234227d; epssw=1*GhAO11iC4fpjtdDMIAS3NJtnZ2Ua7RkM7yFiusduyAXPNAPdP_COF962NKCQQv62jhA9AJax1L_VGIjtjhjMjpB2jiSFYQ_DGEfQ10oS6yng6Tsi5HkmdPeROfPRxjTk68mneKkBev9RyUpR3kmndLeCbaQRFtz4ywgQBFkxzJAuN6dy1CuzaLHRnJ9-xDmnxf..; isg=BJ2dqEOQpPHqMEALviHAQAKJrH-XutEMXGNdAF9i2fQjFr1IJwrh3GuERBQQzenE; tfstk=eH2BpYvkTzeaxPOH5wsafPUT4QH5uy6qV3i8mupe2vHpyUEx7YSHa6mSFVZqa2e7qLi82zjnzMfaxkDoeZ74Ftr3xqfDvmX4WchPTYQVuOW4xkDoeWlG1oITrROETqtf3h4G_0hIkk6BeLw63XgYvV9-jRiCrqEK5Lp54cpqlthJNQ0pFcgVfGOkZ1jzGKRYMzmi9cmG5Gs6amhKjcgVfGOkZXnijNs1fQoA.",
        "origin: https://www.lazada.vn",
        "referer: https://www.lazada.vn/",
        "sec-ch-ua: \"Not A(Brand\";v=\"99\", \"Google Chrome\";v=\"121\", \"Chromium\";v=\"121\"",
        "sec-ch-ua-mobile: ?1",
        "sec-ch-ua-platform: \"Android\"",
        "sec-fetch-dest: empty",
        "sec-fetch-mode: cors",
        "sec-fetch-site: same-site",
        "user-agent: Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko)",
    )
    @GET("")
    fun getListLazada(
        @Url url: String = "https://acs-m.lazada.vn/h5/mtop.relationrecommend.lazadarecommend.recommend/1.0/?jsv=2.7.2&appKey=24677475&t=1707975086194&sign=0c9f28ba95817ec88ac4db0bd58e652a&api=mtop.relationrecommend.LazadaRecommend.recommend&v=1.0&type=originaljson&isSec=1&AntiCreep=true&timeout=20000&dataType=json&sessionOption=AutoLoginOnly&x-i18n-language=vi&x-i18n-regionID=VN&data=%7B%22appId%22%3A25718%2C%22params%22%3A%22%7B%5C%22appId%5C%22%3A25718%2C%5C%22isbackup%5C%22%3Atrue%2C%5C%22newTileEnable%5C%22%3Atrue%2C%5C%22language%5C%22%3A%5C%22vi%5C%22%2C%5C%22region_id%5C%22%3A%5C%22VN%5C%22%2C%5C%22platform%5C%22%3A%5C%22msite%5C%22%2C%5C%22scene%5C%22%3A%5C%22homepage%5C%22%2C%5C%22appVersion%5C%22%3A%5C%220.0.0%5C%22%2C%5C%22anonymous_id%5C%22%3A%5C%22M1%2BiHXBdsTgCAWgc3knquoSY%5C%22%2C%5C%22userId%5C%22%3A0%2C%5C%22pageNo%5C%22%3A0%7D%22%7D"
    ): Call<BaseResponse<LazadaListData>>

    @Headers(
        "Accept: application/json",
        "Accept-Encoding: gzip, deflate, br",
        "Accept-Language: en-US,en;q=0.9,vi;q=0.8",
        "Content-Type: application/x-www-form-urlencoded",
        "Cookie: t_fv=1696297265756; t_uid=WM0KqM1JXym7I4gWj4sgXJ9wKVFpz94V; cna=M1+iHXBdsTgCAWgc3knquoSY; hng=VN|vi|VND|704; hng.sig=EmlYr96z9MQGc5b9Jyf9txw1yLZDt_q0EWkckef954s; lwrid=AQGNqMlDbzcMV7vbafn6xe5uI%2FYQ; lzd_cid=2846c94f-7cea-449d-da9e-5e8e3dea4e7b; _gcl_au=1.1.107585883.1707933785; xlly_s=1; lzd_sid=145c375776ec2a2de64a05e93ddfed8c; _tb_token_=5a06be6e0eb4e; _m_h5_tk=aee13d1e6a6ac7fe81a5485665600c99_1707977949016; _m_h5_tk_enc=952e7887bc221782ccfddaa817951b66; t_sid=KyXA6bE0TUJzeelWab3E5B3zJJyyzAP6; utm_channel=NA; x5sec=7b22617365727665722d6c617a6164613b33223a22617c434d656874713447454f4f63785a66392f2f2f2f2f77456943584a6c5932467764474e6f595444367a7275692f662f2f2f2f3842536a41774d5441775a6d59774d4441774d4441774d4441774f4441774d4441774d4451324f44466a5a6d5530596a67334f4751324f4755774d4441774d4441774d44413d222c22733b32223a2231663262366337333134633337383133227d; epssw=1*MCdO11gVG5LxtQGS7zeuOJtnK4FSNqzauzFRMK14PaePNcGdlbBC3CB5dtRiG9626T15X5UupK8VGF34dtSMjh-wNO693Gf90gvTTuoSH2rg6a-ivhwmdoHy9gORxjTFTYmnxk2R38B2xkDR38B4xD4J_8B4Ftz4ywgQ8J2xzzSWvUnyRl_vxMXRnJ9-dLHBef..; tfstk=eEbBpL0oYTQNtOinCJNN1OpFRQL739a2NbORi_3EweLKeYCvQUPn4kAWPd124pQ5Z4ORwTVHUWqNt6Yky-yVPr5hteVpH_4VBCKzYUe43PzVt6YkyM-MGuSt9NieYKGbu0AG_QtBH6aIy4_suH9A9dgJsNOQEKCpC4354l32hrK-V0vKPC9415ioqlVPcqoADTAMvCAgC5Ns4IKpsC9415ioqHdMsRN_10RA.; isg=BJubrvfXeu8PNobNDDvurjDTKvkFcK9yLgkbxo3YdxqxbLtOFUA_wrnuAtJi1wdq",
        "Origin: https://www.lazada.vn",
        "Referer: https://www.lazada.vn/",
        "Sec-Ch-Ua: \"Not A(Brand\";v=\"99\", \"Google Chrome\";v=\"121\", \"Chromium\";v=\"121\"",
        "Sec-Ch-Ua-Mobile: ?0",
        "Sec-Ch-Ua-Platform: \"macOS\"",
        "Sec-Fetch-Dest: empty",
        "Sec-Fetch-Mode: cors",
        "Sec-Fetch-Site: same-site",
        "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36",
    )
    @GET("/recommend")
    fun getDetailLazada(
        @Query("shop_id") shopId: Long = 2898590,
        @Query("search") search: Int = 0,
        @Query("category_id") categoryId: Int = 12456,
        @Query("item_id") itemId: Long = 2040860262,
        @Query("anonymous_id") anonymousId: String = "02293629-a890-47ca-a66d-efffef44bbef",
        @Query("regional_key") regionalKey: Long = 200203010000,
        @Query("is_ab") isAb: Boolean = false,
        @Query("sku") sku: String = "2040860262_VNAMZ-9524928170",
        @Query("seller_id") sellerId: Long = 200197029085,
        @Query("is_tbc") isTbc: Int = 0,
        @Query("_") under: Long = 1707287709765,
        @Query("brand_id") brandId: Int = 65074,
    ): Call<BaseResponse<LazadaData>>
}