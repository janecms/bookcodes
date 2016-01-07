<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
    <product>
        <productName>
            <xsl:value-of select="/result/name"/>
        </productName>
        <productDescription>
            <xsl:value-of select="/result/description"/>
        </productDescription>
        <price>
            <xsl:value-of select="/result/price"/>
        </price>
        <supplierName>
            <xsl:value-of select="/result/supplier/name"/>
        </supplierName> 
    </product>    
    </xsl:template>
</xsl:stylesheet> 