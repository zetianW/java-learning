package enumtest;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/09/28
 **/
public enum SizeEnum {
    /**
     * 小号
     */
    SMALL("S", "小码", "SMALL"),
    /**
     * 中号
     */
    MEDIUM("M", "中码", "MEDIUM"),
    /**
     * 大号
     */
    LARGE("L", "大码", "LARGE"),
    /**
     * 特大号
     */
    EXTRA_LARGE("XL", "特大码", "EXTRA_LARGE");

    private String name;

    private String code;

    private String description;

    private SizeEnum(String code, String description, String name) {
        this.code = code;
        this.description = description;
        this.name = name;
    }

    public static SizeEnum getByCode(String code) {
       SizeEnum sizeEnum;
        switch (code) {
            case "S":
                sizeEnum = SMALL;
                break;
            case "M":
                sizeEnum = MEDIUM;
                break;
            case "L":
                sizeEnum = LARGE;
                break;
            case "XL":
                sizeEnum = EXTRA_LARGE;
                break;
            default:
                sizeEnum = null;
        }

        return sizeEnum;

    }

    public static SizeEnum getByName(String name) {
        SizeEnum sizeEnum;

        switch (name) {
            case "SMALL":
                sizeEnum = SMALL;
                break;
            case "MEDIUM":
                sizeEnum = MEDIUM;
                break;
            case "LARGE":
                sizeEnum = LARGE;
                break;
            case "EXTRA_LARGE":
                sizeEnum = EXTRA_LARGE;
                break;
            default:
                sizeEnum = null;
        }

        return sizeEnum;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

