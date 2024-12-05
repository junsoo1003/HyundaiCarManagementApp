package com.autoever.hyundaicarmanagementapp6.models

data class Car(
    val carId: String,          // 차량 고유 ID
    val ownerId: String,        // 차량 소유자 ID
    val model: String,          // 차량 모델명 (예: "Hyundai Tucson")
    val photoUrl: String? = null,  // 차량 사진 URL (선택 속성)
    val isEngineOn: Boolean = false, // 시동 상태 (기본값: 꺼짐)
    val temperature: Float = 22.0f,  // 차량 내부 온도 (기본값: 22도)
    val fuelLevel: Float = 0.0f,     // 주유량 (0.0 ~ 100.0, 기본값: 0%)
    val tirePressure: Float = 0.0f,  // 타이어 공기압 (기본값: 0.0 PSI)
    val batteryStatus: Float = 0.0f, // 배터리 상태 (0.0 ~ 100.0, 기본값: 0%)
    val isDoorLocked: Boolean = true, // 문 잠금 상태 (기본값: 잠김)
    val isHornOn: Boolean = false    // 클락션 상태 (기본값: 꺼짐)
)
