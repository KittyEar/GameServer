package com.gameserver.exceptions.gameException.hero;

import com.gameserver.exceptions.CustomBaseException;
import com.gameserver.pojo.msg.HttpStatus;

public class HeroLvUpMaxLvException extends CustomBaseException {
    public HeroLvUpMaxLvException() {
        super(HttpStatus.HERO_LV_MAX_ERROR.getCode(), HttpStatus.HERO_LV_MAX_ERROR.getMsg());
    }
}