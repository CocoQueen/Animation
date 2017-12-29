package com.example.coco.bomb.weather;

import android.animation.TypeEvaluator;

/**
 * Created by coco on 2017/12/29.
 */

public class CircleTypeEvaluator implements TypeEvaluator<CircleInfo> {
    private final CircleInfo info;

    public CircleTypeEvaluator(CircleInfo info) {
        this.info = info;
    }

    @Override
    public CircleInfo evaluate(float fraction, CircleInfo startValue, CircleInfo endValue) {
        float y = startValue.getY() + fraction * (endValue.getY() - startValue.getY());
        float radius = startValue.getRadius() + fraction * (endValue.getRadius() - startValue.getRadius());
        info.setCircleInfo(info.getX(), y, radius);
        return info;
    }
}
