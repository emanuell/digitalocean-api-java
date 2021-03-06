/*
 * The MIT License
 * 
 * Copyright (c) 2010-2014 Jeevanandam M. (myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.myjeeva.digitalocean.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Represents Pages attributes
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.0
 */
public class Pages {

  private String first;

  private String prev;

  private String next;

  private String last;

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * @return the first
   */
  public String getFirst() {
    return first;
  }

  /**
   * @param first the first to set
   */
  public void setFirst(String first) {
    this.first = first;
  }

  /**
   * @return the prev
   */
  public String getPrev() {
    return prev;
  }

  /**
   * @param prev the prev to set
   */
  public void setPrev(String prev) {
    this.prev = prev;
  }

  /**
   * @return the next
   */
  public String getNext() {
    return next;
  }

  /**
   * @param next the next to set
   */
  public void setNext(String next) {
    this.next = next;
  }

  /**
   * @return the last
   */
  public String getLast() {
    return last;
  }

  /**
   * @param last the last to set
   */
  public void setLast(String last) {
    this.last = last;
  }
}
