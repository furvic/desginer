
SELECT
 n1.ORGNAME AS '省份',
 n2.ORGNAME AS '地市',
 c.contract_code '合同的合同编码',
 a.CONTRACT_CODE '卡片的合同编码',
 a.CARD_CODE '卡片编码',
 CASE a.CARD_STATE
WHEN '01' THEN
 '有效'
WHEN '02' THEN
 '已结转'
ELSE
 NULL
END AS '卡片状态',
 a.STATION_CODE '站址编码',
 (
 CASE a.BUSINESS_CODE_TYPE
 WHEN '01' THEN
  "主营业务编码"
 WHEN '02' THEN
  "智联业务编码"
 WHEN '03' THEN
  "能源业务编码"
 END
) AS '业务编码类型',
 a.BUSINESS_CODE AS '业务编码',
 CASE a.CARD_ACCOUNTANT_COURSE
WHEN '01' THEN
 '长摊'
WHEN '02' THEN
 '待摊'
ELSE
 NULL
END AS '卡片会计科目',
 CASE a.CARD_SOURCE
WHEN '01' THEN
 '合同'
WHEN '02' THEN
 '存量接收长摊'
WHEN '03' THEN
 '办公房屋租赁'
ELSE
 NULL
END AS '卡片来源',
 a.PROPERTY_CODE '物业编码',
 a.ORIGINAL_COST_FIRST '建卡原值',
 a.ORIGINAL_COST AS '原值',
 a.AMORTIZATION_AMOUNT AS '月摊销额',
 a.ACCUMULATED_AMORTIZATION AS '累计摊销',
 a.ACCOUNT_PAYABLE AS '应付款',
 DATE_FORMAT(
 a.AMORTIZATION_BEGIN_DATE,
 "%Y%m"
) AS '摊销起始年月',
 DATE_FORMAT(
 a.AMORTIZATION_END_DATE,
 "%Y%m"
) AS '摊销终止年月',
 a.AMORTIZATION_MONTHS AS '摊销期（月）',
 a.HAVE_AMORTIZE_MONTHS AS '已摊销月数',
 a.AMORTIZATION_REMAINING_MONTHS AS '剩余摊销月数',
 a.CARD_CREATE_TIME AS '卡片生成日期',
 CASE a.CARD_CARRY_FORWARD_DATE
WHEN '0000-00-00' THEN
 NULL
ELSE
 a.CARD_CARRY_FORWARD_DATE
END AS '卡片结转日期',
DATE_FORMAT(
  a.CARD_ESTIMATE_CARRY_DATE,
   "%Y%m")
    AS '暂估计提日期'
FROM
 pcmsdb.t_pcm_rent_card a

LEFT JOIN  pcmsdb.t_pcm_contract  c
ON  c.contract_code=a.CONTRACT_CODE
JOIN pydb.org_organization n1 ON n1.ORGCODE = a.PRO_ORGCODE
JOIN pydb.org_organization n2 ON n2.ORGCODE = a.CITY_ORGCODE
WHERE
a.station_code in (


)
 AND c.contract_code IS NOT NULL
AND a.CARD_CODE IS NOT NULL
AND a.CARD_STATE = '01'
;

