package online.shixun.project.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNull() {
            addCriterion("stu_num is null");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNotNull() {
            addCriterion("stu_num is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumEqualTo(Integer value) {
            addCriterion("stu_num =", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotEqualTo(Integer value) {
            addCriterion("stu_num <>", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThan(Integer value) {
            addCriterion("stu_num >", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_num >=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThan(Integer value) {
            addCriterion("stu_num <", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThanOrEqualTo(Integer value) {
            addCriterion("stu_num <=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumIn(List<Integer> values) {
            addCriterion("stu_num in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotIn(List<Integer> values) {
            addCriterion("stu_num not in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumBetween(Integer value1, Integer value2) {
            addCriterion("stu_num between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_num not between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuProIsNull() {
            addCriterion("stu_pro is null");
            return (Criteria) this;
        }

        public Criteria andStuProIsNotNull() {
            addCriterion("stu_pro is not null");
            return (Criteria) this;
        }

        public Criteria andStuProEqualTo(String value) {
            addCriterion("stu_pro =", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotEqualTo(String value) {
            addCriterion("stu_pro <>", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProGreaterThan(String value) {
            addCriterion("stu_pro >", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pro >=", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLessThan(String value) {
            addCriterion("stu_pro <", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLessThanOrEqualTo(String value) {
            addCriterion("stu_pro <=", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLike(String value) {
            addCriterion("stu_pro like", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotLike(String value) {
            addCriterion("stu_pro not like", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProIn(List<String> values) {
            addCriterion("stu_pro in", values, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotIn(List<String> values) {
            addCriterion("stu_pro not in", values, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProBetween(String value1, String value2) {
            addCriterion("stu_pro between", value1, value2, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotBetween(String value1, String value2) {
            addCriterion("stu_pro not between", value1, value2, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuDirIsNull() {
            addCriterion("stu_dir is null");
            return (Criteria) this;
        }

        public Criteria andStuDirIsNotNull() {
            addCriterion("stu_dir is not null");
            return (Criteria) this;
        }

        public Criteria andStuDirEqualTo(String value) {
            addCriterion("stu_dir =", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirNotEqualTo(String value) {
            addCriterion("stu_dir <>", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirGreaterThan(String value) {
            addCriterion("stu_dir >", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirGreaterThanOrEqualTo(String value) {
            addCriterion("stu_dir >=", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirLessThan(String value) {
            addCriterion("stu_dir <", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirLessThanOrEqualTo(String value) {
            addCriterion("stu_dir <=", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirLike(String value) {
            addCriterion("stu_dir like", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirNotLike(String value) {
            addCriterion("stu_dir not like", value, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirIn(List<String> values) {
            addCriterion("stu_dir in", values, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirNotIn(List<String> values) {
            addCriterion("stu_dir not in", values, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirBetween(String value1, String value2) {
            addCriterion("stu_dir between", value1, value2, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuDirNotBetween(String value1, String value2) {
            addCriterion("stu_dir not between", value1, value2, "stuDir");
            return (Criteria) this;
        }

        public Criteria andStuSkillIsNull() {
            addCriterion("stu_skill is null");
            return (Criteria) this;
        }

        public Criteria andStuSkillIsNotNull() {
            addCriterion("stu_skill is not null");
            return (Criteria) this;
        }

        public Criteria andStuSkillEqualTo(Integer value) {
            addCriterion("stu_skill =", value, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillNotEqualTo(Integer value) {
            addCriterion("stu_skill <>", value, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillGreaterThan(Integer value) {
            addCriterion("stu_skill >", value, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_skill >=", value, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillLessThan(Integer value) {
            addCriterion("stu_skill <", value, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillLessThanOrEqualTo(Integer value) {
            addCriterion("stu_skill <=", value, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillIn(List<Integer> values) {
            addCriterion("stu_skill in", values, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillNotIn(List<Integer> values) {
            addCriterion("stu_skill not in", values, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillBetween(Integer value1, Integer value2) {
            addCriterion("stu_skill between", value1, value2, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuSkillNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_skill not between", value1, value2, "stuSkill");
            return (Criteria) this;
        }

        public Criteria andStuAbilityIsNull() {
            addCriterion("stu_ability is null");
            return (Criteria) this;
        }

        public Criteria andStuAbilityIsNotNull() {
            addCriterion("stu_ability is not null");
            return (Criteria) this;
        }

        public Criteria andStuAbilityEqualTo(Integer value) {
            addCriterion("stu_ability =", value, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityNotEqualTo(Integer value) {
            addCriterion("stu_ability <>", value, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityGreaterThan(Integer value) {
            addCriterion("stu_ability >", value, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_ability >=", value, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityLessThan(Integer value) {
            addCriterion("stu_ability <", value, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityLessThanOrEqualTo(Integer value) {
            addCriterion("stu_ability <=", value, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityIn(List<Integer> values) {
            addCriterion("stu_ability in", values, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityNotIn(List<Integer> values) {
            addCriterion("stu_ability not in", values, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityBetween(Integer value1, Integer value2) {
            addCriterion("stu_ability between", value1, value2, "stuAbility");
            return (Criteria) this;
        }

        public Criteria andStuAbilityNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_ability not between", value1, value2, "stuAbility");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}