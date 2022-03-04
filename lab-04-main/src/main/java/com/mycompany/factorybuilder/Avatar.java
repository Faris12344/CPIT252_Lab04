package com.mycompany.factorybuilder;

public final class Avatar {

    private final SkinTone tone;
    private final HairType hairType;
    private final HairColor hairColor;
    private final BodyType body;
    private final FacialFeatures face;

    private Avatar(Builder builder) {
        if (builder == null) {
            throw new IllegalArgumentException("Charecter must have a skin tone");
        }
        this.tone = builder.tone;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
        this.body = builder.body;
        this.face = builder.face;
    }

    public SkinTone getSkinTone() {
        return tone;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public BodyType getBodyType() {
        return body;
    }

    public FacialFeatures getFacialFeatures() {
        return face;
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append(tone).append(" skin color");
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            // added another condition for the bald charecters
            if (hairColor != null && !hairColor.toString().equals("none") ) {
                sb.append(hairColor).append(' ');
            }
            
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : " head");
        }
        if (body != null) {
            sb.append(" and a ").append(body).append(" body");
        }
        if (face != null) {
            sb.append(" and a ").append(face);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     * The builder class.
     */
    public static class Builder {

        private final SkinTone tone;
        private HairType hairType;
        private HairColor hairColor;
        private BodyType body;
        private FacialFeatures face;

        /**
         * Constructor.
         */
        public Builder(SkinTone tone) {
            if (tone == null) {
                throw new IllegalArgumentException("SkinTone can not be null");
            }
            this.tone = tone;

        }

        public Builder withHairType(HairType hairType) {
            if (hairType == null) {
                throw new IllegalArgumentException("HairType can not be null");
            }
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {

            if (hairColor == null) {
                throw new IllegalArgumentException("HairColor can not be null");
            } 
            this.hairColor = hairColor;
            return this;
        }

        public Builder withBodyType(BodyType bodyType) {
            if (bodyType == null) {
                throw new IllegalArgumentException("BodyType can not be null");
            }
            this.body = bodyType;
            return this;
        }

        public Builder withFacialFeatures(FacialFeatures facialFeatures) {
            if (facialFeatures == null) {
                throw new IllegalArgumentException("FacialFeatures can not be null");
            }
            this.face = facialFeatures;
            return this;
        }

        // TODO: Add with withHairColor, withBodyType, withFacialFeatures
        public Avatar build() {
            Avatar ava = new Avatar(this);
            return ava;
        }
    }
}
