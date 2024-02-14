package com.frank.demointer.network

import com.frank.demointer.models.BaseResponse
import com.frank.demointer.models.lazada.LazadaData
import com.frank.demointer.models.lazada.Products
import com.frank.demointer.models.shopee.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

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
}

interface ApiLazadaService {

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
    fun getListLazada(
        @Query("bundle") bundle: String = "daily_discover_main",
        @Query("item_card") itemCard: Int = 1,
        @Query("limit") limit: Int = 20,
        @Query("need_tab") needTab: Boolean = false,
        @Query("offset") offset: Int = 0,
        @Query("view_session_id") viewSessionId: String = "2051404c-b801-408a-9446-1f89874593b9",
    ): Call<BaseResponse<Data>>

    @Headers(
//        "Accept: application/json",
//        "Accept-Encoding: gzip, deflate, br",
//        "Accept-Language: en-US,en;q=0.9,vi;q=0.8",
//        "Content-Type: application/x-www-form-urlencoded",
//        "Cookie: t_fv=1707213594151; t_uid=otvGP3BLzlkSGG1OcapQnNArxML4lE1N; hng=VN|en|VND|704; cna=GvFIHsyZ8RMCASp3Aq4f+ifN; lzd_cid=02293629-a890-47ca-a66d-efffef44bbef; lzd_sid=110f64cc6c942ad50b4311d4dcc0f9b7; _tb_token_=ba0e33f5797e; xlly_s=1; lwrid=AQGNfeNSuBKXL7OMffyAxe5uI%2FYQ; XSRF-TOKEN=21be23a8-d30b-4d19-88f3-14a14b03ca4e; t_sid=hUeOSY2eMsgifdGklnRDpify5LBtxgxk; utm_channel=NA; _m_h5_tk=7037daf3b34c5e619b53e9fcf6f3e641_1707295578633; _m_h5_tk_enc=e0887e5e2cbe1d7ecb3addf9f150fef8; tfstk=eTmkzTTACS1sq_SsHbEWDHhStCLYF_ZIYXIL9kFeuSPfw_I-LpqnEXmpFvyK-jDIp7nLeQwUTSkZ9adSUk03Mj08wYoLxJPxOXF-UYIntSH8wYHyNk2UMfG3RLNLTWcKL4pvXhHSFkZEtCK9X0et-5ATnGwWsYZQYIdvNW4sFfIIYFjh2w7TtwnXEPFGIIt6c0Yak5kzgXhK08fT_YPcYMPuEz4xUSjFYmjyyZ7Z_dSQ3pnVRwazh-V9-XDC7jViievDnNT7z-wJ6KvcRTUzh8q2nKbNDzybHv5..; isg=BBAQyh4qQVDiMx1VviOPiYhK4Vhi2fQjOk3oJArh3Gs-RbDvsunEs2b3HRWllaz7; epssw=1*iEV611Gg21pxtQGSIASGt1ITh2U4urzauzFR-onjp2UV7lGLP_h6F1B5NKCcmlxMdtR9P9zpfhOJ0XLo6T_2uGxMbhR9RApV6UR2bxaF9qez825C7EIpf-DQU-PpH_QR-1IAe-zyzMmndDpJ3kmnetyR3DqddLHpeDmnxDDv4Ey9KQ4uz38QfZKhxMmEdLHBeYB4",
//        "Origin: https://www.lazada.vn",
//        "Referer: https://www.lazada.vn/",
//        "Sec-Ch-Ua-Platform: \"macOS\"",
//        "Sec-Fetch-Dest: empty",
//        "Sec-Fetch-Mode: cors",
//        "Sec-Fetch-Site: same-site",
//        "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36",

        "Accept: application/json",
        "Accept-Encoding: gzip, deflate, br",
        "Accept-Language: en-US,en;q=0.9,vi;q=0.8",
        "Content-Type: application/x-www-form-urlencoded",
        "Cookie: t_fv=1707213594151; t_uid=otvGP3BLzlkSGG1OcapQnNArxML4lE1N; hng=VN|en|VND|704; cna=GvFIHsyZ8RMCASp3Aq4f+ifN; lzd_cid=02293629-a890-47ca-a66d-efffef44bbef; lzd_sid=110f64cc6c942ad50b4311d4dcc0f9b7; _tb_token_=ba0e33f5797e; xlly_s=1; lwrid=AQGNfeNSuBKXL7OMffyAxe5uI%2FYQ; XSRF-TOKEN=21be23a8-d30b-4d19-88f3-14a14b03ca4e; t_sid=hUeOSY2eMsgifdGklnRDpify5LBtxgxk; utm_channel=NA; _m_h5_tk=7037daf3b34c5e619b53e9fcf6f3e641_1707295578633; _m_h5_tk_enc=e0887e5e2cbe1d7ecb3addf9f150fef8; tfstk=eTmkzTTACS1sq_SsHbEWDHhStCLYF_ZIYXIL9kFeuSPfw_I-LpqnEXmpFvyK-jDIp7nLeQwUTSkZ9adSUk03Mj08wYoLxJPxOXF-UYIntSH8wYHyNk2UMfG3RLNLTWcKL4pvXhHSFkZEtCK9X0et-5ATnGwWsYZQYIdvNW4sFfIIYFjh2w7TtwnXEPFGIIt6c0Yak5kzgXhK08fT_YPcYMPuEz4xUSjFYmjyyZ7Z_dSQ3pnVRwazh-V9-XDC7jViievDnNT7z-wJ6KvcRTUzh8q2nKbNDzybHv5..; isg=BBAQyh4qQVDiMx1VviOPiYhK4Vhi2fQjOk3oJArh3Gs-RbDvsunEs2b3HRWllaz7; epssw=1*iEV611Gg21pxtQGSIASGt1ITh2U4urzauzFR-onjp2UV7lGLP_h6F1B5NKCcmlxMdtR9P9zpfhOJ0XLo6T_2uGxMbhR9RApV6UR2bxaF9qez825C7EIpf-DQU-PpH_QR-1IAe-zyzMmndDpJ3kmnetyR3DqddLHpeDmnxDDv4Ey9KQ4uz38QfZKhxMmEdLHBeYB4",
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