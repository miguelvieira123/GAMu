<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <xsl:apply-templates select="//audicao"/>
        
    </xsl:template>
    <xsl:template match="audicao">
        <fieldset id="{@id}">
            <legend><xsl:apply-templates select="@id"/></legend>
            <table>
                <tr><td class="t1">Organizador:</td><td><xsl:apply-templates select="metainfo/organizador"/></td></tr>
                <tr><td class="t1">Tema:</td><td><xsl:apply-templates select="metainfo/tema"/></td></tr>
                <tr><td class="t1">Data:</td><td><xsl:apply-templates select="metainfo/data"/></td></tr>
                <tr><td class="t1">Hora:</td><td><xsl:apply-templates select="metainfo/hora"/></td></tr>
                <tr><td class="t1">Lugar:</td><td><xsl:apply-templates select="metainfo/local"/></td></tr>
                <tr><td class="t1">Duracao:</td><td><xsl:apply-templates select="metainfo/duracao"/></td></tr>
                
            </table>
            <input type="button" value="Ver mais" onClick="setHtml(./audition.php?id={@id})"/><input type="button" value="alterar" onClick="setHtml(./changeAudition.php?id={@id})"/><input type="button" value="Eliminar" onClick="setHtml(./delAudition.php?id={@id})"/>
        </fieldset>
    </xsl:template>
</xsl:stylesheet>